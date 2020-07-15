export default class Block {

    private index: number;
    private hash: string;
    private previousHash: string;
    private timestamp: number;
    private data: string;

    constructor(index: number, hash: string, previousHash: string, timestamp: number, data: string) {
        this.index = index;
        this.hash = hash;
        this.previousHash = previousHash;
        this.timestamp = timestamp;
        this.data = data;
    }

    getIndex = (): number => {
        return this.index;
    }

    getHash = (): string => {
        return this.hash;
    }

    getPreviousHash = (): string => {
        return this.previousHash;
    }

    getTimestamp = (): number => {
        return this.timestamp;
    }

    getData = (): string => {
        return this.data;
    }

    calculateHash = (index: number, previousHash: number, timestamp: number, data: string) => {
        
    }
}
