/**
 * @param {number[]} players
 * @param {number[]} trainers
 * @return {number}
 */
var matchPlayersAndTrainers = function(players, trainers) {
    players.sort((a, b) => a - b);
        trainers.sort((a, b) => a - b);

        let count = 0;
        let i = 0; // pointer for players
        let j = 0; // pointer for trainers

        while(i < players.length && j < trainers.length){
            if(players[i] <= trainers[j]){
                // Match found, move both pointers
                count++;
                i++;
                j++;
            }else{
                // Current trainer can't train this player, try next trainer
                j++;
            }
        }

    return count;
};