def dense_ranking(total_players, scores, num_games, gits_scores):
    ranked_scores = list(set(scores))  # Remove duplicates and sort the scores in ascending order
    ranked_scores.sort(reverse=True)

    rankings = []

    for score in gits_scores:
        scores.append(score)
        scores.sort(reverse=True)

        rank = 1
        for i in range(1, len(scores)):
            if scores[i] < scores[i - 1]:
                rank += 1

            if scores[i] == score:
                rankings.append(rank)
                break

    return rankings

def main():
    try:
        total_players = int(input("Masukkan jumlah pemain: "))
        scores = list(map(int, input("Masukkan daftar skor pemain (dipisahkan oleh spasi): ").split()))

        num_games = int(input("Masukkan jumlah permainan yang diikuti oleh GITS: "))
        gits_scores = list(map(int, input("Masukkan skor GITS setelah setiap permainan (dipisahkan oleh spasi): ").split()))

        result = dense_ranking(total_players, scores, num_games, gits_scores)
        print("Sampel Output:")
        print(*result)

    except ValueError:
        print("Masukkan angka yang valid!")

if __name__ == "__main__":
    main()